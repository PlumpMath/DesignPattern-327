package com.dp.composite.example3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Composite extends Component {

    ArrayList<Component> children ;

    private String name;
    public Composite(String name){
        this.name= name;
    }

    public void addChild(Component component) {
        if(component == null){
            return;
        }
        if(children == null){
            children = new ArrayList<Component>();
        }
        children.add(component);
    }

    public void removeChile(Component component) {
        if(component == null || children == null){
            return;
        }
        Iterator<Component> iterator = children.iterator();
        while (iterator.hasNext()){
            Component component1 = iterator.next();
            if(component1 != null && component1 == component){
                iterator.remove();
            }
        }
    }

    public void operation(String pre) {
        System.out.println(pre+"#"+this.name);
        pre +=" ";
        if(children != null && children.size()>0){
            for(Component component:children){
                component.operation(pre);
            }

        }
    }
}
