package com.toki.hatchsimulator.constant;

public class FilePath {
    // 아마 실제 DB 라면 환경변수로?
    private static final String USER_DB_FILE_PATH = "src/main/java/com/toki/hatchsimulator/db/user.db";

    public static String getUserDbFilePath(){
        return USER_DB_FILE_PATH;
    }
}
