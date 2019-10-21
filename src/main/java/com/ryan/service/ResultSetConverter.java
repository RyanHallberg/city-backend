package com.ryan.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetConverter {
    public static JSONArray convert(ResultSet rs) throws SQLException, JSONException
    {
        JSONArray json = new JSONArray();
        ResultSetMetaData rsmd = rs.getMetaData();
        while(rs.next()){
            int columnCnt = rsmd.getColumnCount();
            JSONObject obj = new JSONObject();
            for(int i = 1; i <= columnCnt; i++){
                String column_name = rsmd.getColumnName(i);

                obj.put(column_name, rs.getString(i));
            }
            json.put(obj);
        }
        return json;
    }

}
