package com.design.cn.prototype;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    private String name;

    public DeepProtoTypeTarget deepProtoTypeTarget;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    /**
     * 自定义深度克隆
     * @return
     * @throws CloneNotSupportedException
     */
    public DeepProtoType clone2() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = (DeepProtoType)super.clone();
        deepProtoType.deepProtoTypeTarget=(DeepProtoTypeTarget)deepProtoType.deepProtoTypeTarget.clone();
        return deepProtoType;
    }


    /**
     * 序列化深度克隆
     * @return
     */
    public DeepProtoType DeepClone(){

        ByteArrayInputStream bis = null;
        ObjectInputStream ois=null;
        ByteArrayOutputStream bos= null;
        ObjectOutputStream oos =null;

        try {
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            Object object = ois.readObject();
            return (DeepProtoType)object;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
