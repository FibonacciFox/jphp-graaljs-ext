package org.develnext.jphp.ext.graaljs.classes;

import org.develnext.jphp.ext.graaljs.GraalJsExtension;


import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;

@Name("ObjectTest")
@Namespace(GraalJsExtension.NS)
public class ObjectTest extends BaseObject {

    public ObjectTest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    @Signature
    public void hello(ObjectMemory obj) {

    }

}