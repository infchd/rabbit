package com.infchd.spring.learn1;

public class HelloService {
    private HelloDao helloDao;

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public void findAll(){
        helloDao.findAll();
    }
}
