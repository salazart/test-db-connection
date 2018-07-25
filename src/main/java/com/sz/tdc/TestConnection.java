package com.sz.tdc;

import com.sz.tdc.services.ConnectionService;

public class TestConnection {
    public static void main(String[] args) {
        String url = args.length > 0 ? args[0] : "";
        String user = args.length > 1 ? args[1] : "";
        String pass = args.length > 2 ? args[2] : "";

        try {
            if (ConnectionService.getInstance().getConnection(url, user, pass) != null) {
                System.exit(0);
            } else {
                System.exit(1);
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
