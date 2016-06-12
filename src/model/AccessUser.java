/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import tools.DBHelper;
import tools.json.JSONObject;

/**
 *
 * @author maokelong
 */
public class AccessUser {

    /**
     * 保存用户信息到数据库
     */
    public static void saveUser(EntityUser entityUser) {
        String keyString = "0";
        DBHelper dBHelper = new DBHelper();
        dBHelper.openDatabase();
        dBHelper.writeToDatabase(keyString, new JSONObject(entityUser).toString(), true);
        dBHelper.closeDatabase();
    }

    /**
     * 从数据库获取用户信息
     * @return 用户对象
     */
    public static EntityUser getUser() {
        EntityUser entityUser;
        String keyString = "0";
        DBHelper dBHelper = new DBHelper();
        dBHelper.openDatabase();
        try {
            entityUser = new EntityUser(dBHelper.readFromDatabase(keyString));
        } catch (Exception e) {
            entityUser = new EntityUser();
        }
        dBHelper.closeDatabase();
        return entityUser;
    }

}
