package org.fibonaccifox.graaljs.classes;

import php.runtime.Memory;
import php.runtime.env.Environment;

import php.runtime.memory.ObjectMemory;

public class ClassMediator {

    private ObjectMemory objectMemory;

    ClassMediator(ObjectMemory value) {
        this.objectMemory = value;
    }

    public Memory getValue(String nameValue) {

        
        return this.objectMemory.value.getProp(nameValue);
    }

    public void setValue(String name, Memory valueMemory) {
        this.objectMemory.value.setProp(name, valueMemory);
    }

    public void setValue(String name, String valueMemory) {
        this.objectMemory.value.setProp(name, valueMemory);
    }

    public void setValue(String name, Boolean valueMemory) {
        this.objectMemory.value.setProp(name, valueMemory);
    }

    public void setValue(String name, Double valueMemory) {
        this.objectMemory.value.setProp(name, valueMemory);
    }

    public void setValue(String name, long valueMemory) {
        this.objectMemory.value.setProp(name, valueMemory);
    }

    public Memory invoke(String name) throws Throwable {
        Environment env = this.objectMemory.value.getEnvironment();
        return env.invokeMethod(this.objectMemory, name);
    }
}