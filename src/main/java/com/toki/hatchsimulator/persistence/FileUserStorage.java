package com.toki.hatchsimulator.persistence;

import com.toki.hatchsimulator.domain.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUserStorage implements UserStorage{
    private static final String FILE_PATH =
            "src/main/java/com/toki/hatchsimulator/db/userDB.dat";


    @Override
    public void saveUsers(List<User> userList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(userList);
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 오류 : " + e.getMessage());
        }
    }

    @Override
    public List<User> loadUsers() {
        File file = new File(FILE_PATH);
        if(!file.exists()){
            return new ArrayList<>();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            return (List<User>) ois.readObject();
        }catch(EOFException e){
            System.out.println("파일 로드 완료");
            return new ArrayList<>();
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException("파일 로드 중 오류 발생" + e.getMessage());
        }
    }
}
