package org.fibonaccifox.graaljs;

import org.fibonaccifox.graaljs.classes.BuilderWrapper;
import org.fibonaccifox.graaljs.classes.ContextWrapper;
import org.fibonaccifox.graaljs.classes.ValueWrapper;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.Context.Builder;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

//import org.fibonaccifox.graaljs.classes.BuilderWrapper;
//import org.fibonaccifox.graaljs.classes.ContextWrapper;
//import org.fibonaccifox.graaljs.classes.ObjectTest;
//import org.fibonaccifox.graaljs.classes.ValueWrapper;

public class GraalJsExtension extends Extension {

    public static final String NS = "graaljs";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, Context.class, ContextWrapper.class);
        registerWrapperClass(scope, Value.class, ValueWrapper.class);
        registerWrapperClass(scope, Builder.class, BuilderWrapper.class);
    }

}