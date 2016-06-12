/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailclientcn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JLabel;
import model.AccessUser;
import model.EntityUser;
import tools.DBHelper;
import tools.json.JSONObject;
import view.FrameLogin;
import view.FrameMain;

/**
 *
 * @author maokelong
 */
public class EmailClientCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //打开登陆窗体
        FrameLogin frameLogin = new FrameLogin();
        frameLogin.setVisible(true);
    }

}
