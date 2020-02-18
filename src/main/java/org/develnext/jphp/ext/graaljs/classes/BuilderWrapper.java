package org.develnext.jphp.ext.graaljs.classes;

import org.develnext.jphp.ext.graaljs.GraalJsExtension;

import php.runtime.annotation.Reflection.Final;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import org.graalvm.polyglot.Context.Builder;

@Name("Builder")
@Namespace(GraalJsExtension.NS)
@Final
public class BuilderWrapper extends BaseWrapper<Builder> {

    /**
     * 
     * @param env
     * @param wrappedObject
     */
    public BuilderWrapper(Environment env, Builder wrappedObject) {
        super(env, wrappedObject);
    }

    /**
     * 
     * @param env
     * @param clazz
     */
    public BuilderWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public BuilderWrapper allowAllAccess(boolean enabled) {
        return new BuilderWrapper(__env__, getWrappedObject().allowAllAccess(enabled));
    }

    @Signature
    public ContextWrapper build() {
        return new ContextWrapper(__env__, getWrappedObject().build());
    }


}