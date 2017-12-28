package com.example.zhijun.renzhijun20171201greendao;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.example.zhijun.renzhijun20171201greendao.gen.DaoSession;
import com.example.zhijun.renzhijun20171201greendao.gen.UserDao;

import java.util.List;

/**
 * Created by Zhijun on 2017/12/1.
 */

public class DbService {
    private static final String TAG = DbService.class.getSimpleName();
    private static DbService instance;
    private static Context appContext;
    private DaoSession mDaoSession;
    private UserDao userDao;


    private DbService() {
    }

    /**
     * 采用单例模式
     * @param context     上下文
     * @return            dbservice
     */
    public static DbService getInstance(Context context) {
        if (instance == null) {
            instance = new DbService();
            if (appContext == null){
                appContext = context.getApplicationContext();
            }
            instance.mDaoSession = BaseApplication.getDaoSession(context);
            instance.userDao = instance.mDaoSession.getUserDao();
        }
        return instance;
    }

    /**
     * 根据用户id,取出用户信息
     * @param id           用户id
     * @return             用户信息
     */
    public User loadNote(long id) {
        if(!TextUtils.isEmpty(id + "")) {
            return userDao.load(id);
        }
        return  null;
    }

    /**
     * 取出所有数据
     * @return      所有数据信息
     */
    public List<User> loadAllNote(){
        return userDao.loadAll();
    }

    /**
     * 生成按id倒排序的列表
     * @return      倒排数据
     */
    public List<User> loadAllNoteByOrder()
    {
        return userDao.queryBuilder().orderDesc(UserDao.Properties.UId).list();
    }

    /**
     * 根据查询条件,返回数据列表
     * @param where        条件
     * @param params       参数
     * @return             数据列表
     */
    public List<User> queryNote(String where, String... params){
        return userDao.queryRaw(where, params);
    }


    /**
     * 根据用户信息,插件或修改信息
     * @param user              用户信息
     * @return 插件或修改的用户id
     */
    public long saveNote(User user){
        return userDao.insertOrReplace(user);
    }


    /**
     * 批量插入或修改用户信息
     * @param list      用户信息列表
     */
    public void saveNoteLists(final List<User> list){
        if(list == null || list.isEmpty()){
            return;
        }
        userDao.getSession().runInTx(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<list.size(); i++){
                    User user = list.get(i);
                    userDao.insertOrReplace(user);
                }
            }
        });

    }

    /**
     * 删除所有数据
     */
    public void deleteAllNote(){
        userDao.deleteAll();
    }

    /**
     * 根据id,删除数据
     * @param id      用户id
     */
    public void deleteNote(long id){
        userDao.deleteByKey(id);
        Log.i(TAG, "delete");
    }

    /**
     * 根据用户类,删除信息
     * @param user    用户信息类
     */
    public void deleteNote(User user){
        userDao.delete(user);
    }
}
