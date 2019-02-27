package com.example.mykotlin;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1(){
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testGetterSetter(){
        PersonJava personJava = new PersonJava("John");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("John", personJava.getName());

        Person person = new Person("John");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("John", person.getName());


    }

    @Test
    public void testSetNickname() {
        PersonJava personJava = new PersonJava("john");

        personJava.setNickName("Apple");
        Assert.assertEquals("apple", personJava.getNickname());

        Person person = new Person("John");

        person.setNickname("apple");

        Assert.assertEquals("apple", person.getNickname());
    }

    @Test
    public void testSingletonJava(){
        SingletonJava singletonJava = SingletonJava.getInstance();

        singletonJava.log("hi, singheton");
    }

    @Test
    public void testFruit(){
        FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "사과";
        fruitJava.description = "사과는 맛있다";
        System.out.println(fruitJava);
    }
    @Test
    public void testFruitEquals(){
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";

        Assert.assertEquals(fruitJava1,fruitJava2);
    }
    @Test
    public void testFruitHashCode(){
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";

        Assert.assertEquals(fruitJava1.hashCode(),fruitJava2.hashCode());
    }
    @Test
    public void testExtFunc() {
        String lastString = StringExtKt.lastString("apple");
        Assert.assertEquals("e",lastString);
    }

//    @Test
//    public void testNPE1() {
//        NPE npe = new NPE();
//
//        Assert.assertEquals(3, npe.strLen("abc"));
//
//        Assert.assertEquals(0, npe.strLen(null));
//    }

//    @Test
//    public void testNullType() {
//        Assert.assertEquals(true, null instanceof String);
//    }
//}
