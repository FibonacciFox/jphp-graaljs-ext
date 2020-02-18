package org.develnext.jphp.ext.graaljs;

import org.develnext.jphp.ext.graaljs.classes.BuilderWrapper;
import org.develnext.jphp.ext.graaljs.classes.ContextWrapper;
import org.develnext.jphp.ext.graaljs.classes.ObjectTest;
import org.develnext.jphp.ext.graaljs.classes.ValueWrapper;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.Context.Builder;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class GraalJsExtension extends Extension {

    public static final String NS = "graaljs";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerClass(scope, ObjectTest.class);
        registerWrapperClass(scope, Context.class, ContextWrapper.class);
        registerWrapperClass(scope, Value.class, ValueWrapper.class);
        registerWrapperClass(scope, Builder.class, BuilderWrapper.class);
    }

}