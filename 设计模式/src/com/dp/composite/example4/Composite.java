package com.dp.composite.example4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @desc 具体树枝类，即容器类
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Composite extends Component {

    ArrayList<Component> children ;

    private String name;
    public Composite(String name){
        this.name= name;
    }

    @Override
    public void addChild(Component component) {
        if(component == null){
            return;
        }
        if(children == null){
            children = new ArrayList<Component>();
        }
        children.add(component);
        component.setParent(this);
    }

    @Override
    public void removeChile(Component component) {
        if(component == null || children == null){
            return;
        }
        Iterator<Component> iterator = children.iterator();
        while (iterator.hasNext()){
            Component component1 = iterator.next();
            if(component1 != null && component1 == component){
                iterator.remove();
                if(component instanceof Composite && component1.getChild() != null){
                    for(Component component2:component.getChild()){
                        component2.setParent(this);
                        addChild(component2);
                    }
                }
                break;
            }
        }
    }

    @Override
    public ArrayList<Component> getChild() {
        return children;
    }

    @Override
    public void operation(String pre) {
        System.out.println(pre+"#"+this.name);
        pre +="   ";
        if(children != null && children.size()>0){
            for(Component component:children){
                component.operation(pre);
            }
        }
    }
}
