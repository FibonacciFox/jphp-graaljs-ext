package org.develnext.jphp.ext.graaljs.classes;

import org.develnext.jphp.ext.graaljs.GraalJsExtension;

import org.graalvm.polyglot.Engine;

import php.runtime.annotation.Reflection.Final;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Name("Engine")
@Namespace(GraalJsExtension.NS)
@Final
public class EngineWrapper extends BaseWrapper<Engine> {

    /**
     * 
     * @param env
     * @param wrappedObject
     */
    public EngineWrapper(Environment env, Engine wrappedObject) {
        super(env, wrappedObject);
    }

    /**
     * 
     * @param env
     * @param clazz
     */
    public EngineWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

}