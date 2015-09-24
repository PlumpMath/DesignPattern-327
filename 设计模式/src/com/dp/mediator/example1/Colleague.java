package com.dp.mediator.example1;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/14
 */
public abstract   class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void opreation();

    public Mediator getMediator() {
        return this.mediator;
    }

}
