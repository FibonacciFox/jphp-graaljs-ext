package org.develnext.jphp.ext.graaljs.classes;

import php.runtime.annotation.Reflection.Final;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;

import php.runtime.reflection.ClassEntity;

import org.develnext.jphp.ext.graaljs.GraalJsExtension;

import org.graalvm.polyglot.Context;

@Name("Context")
@Namespace(GraalJsExtension.NS)
@Final
public class ContextWrapper extends BaseWrapper<Context> {

    /**
     * 
     * @param env
     * @param wrappedObject
     */
    public ContextWrapper(Environment env, Context wrappedObject) {
        super(env, wrappedObject);
    }

    /**
     * 
     * @param env
     * @param clazz
     */
    public ContextWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    /**
     * 
     * @param callback
     */
    private void runInPluginContext(ContextCallback callback) {
        ClassLoader oldCl = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        callback.call();
        Thread.currentThread().setContextClassLoader(oldCl);
    }

    interface ContextCallback {
        void call();
    }

    @Signature
    public void __construct() {
        runInPluginContext(() -> {
            __wrappedObject = Context.create();
        });
    }

    /**
     * 
     * @param permittedLanguages
     */
    @Signature
    public void __construct(String... permittedLanguages) {
        runInPluginContext(() -> {
            __wrappedObject = Context.create(permittedLanguages);
        });
    }

    /**
     * Creates a context with default configuration
     * 
     * @param permittedLanguages
     * @return ContextWrapper
     */
    @Signature
    public ContextWrapper create(String... permittedLanguages) {

        ClassLoader oldCl = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        ContextWrapper contextwrapper = new ContextWrapper(__env__, Context.create(permittedLanguages));
        Thread.currentThread().setContextClassLoader(oldCl);
        return contextwrapper;

    };

    /**
     * Требует Доработки. Returns the currently entered polyglot context. A context
     * will be entered if the current executing Java method is called by a Graal
     * guest language or if a context is entered explicitly using Context.enter() on
     * the current thread. The returned context may be used to:
     * 
     * @return ContextWrapper
     */
    @Signature
    public ContextWrapper getCurrent() {
        ClassLoader oldCl = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        ContextWrapper contextwrapper = new ContextWrapper(__env__, Context.getCurrent());
        Thread.currentThread().setContextClassLoader(oldCl);
        return contextwrapper;
    };

    /**
     * Creates a builder for constructing a context with custom configuration.
     * 
     * @param permittedLanguages
     * @return BuilderWrapper
     */
    @Signature
    public BuilderWrapper newBuilder(String... permittedLanguages) {
        ClassLoader oldCl = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        BuilderWrapper builderwrapper = new BuilderWrapper(__env__, Context.newBuilder(permittedLanguages));
        Thread.currentThread().setContextClassLoader(oldCl);
        return builderwrapper;
    };

    /**
     * !Доработать. Converts a host value to a polyglot value representation. This
     * conversion is applied implicitly whenever execution or instantiation
     * arguments are provided, members and array elements are set or when a value is
     * returned by a polyglot proxy. It is not required nor efficient to explicitly
     * convert to polyglot values before performing these operations. This method is
     * useful to convert a mapped host value back to a polyglot value while
     * preserving the identity.
     * 
     * When a host value is converted to a polyglot value the following rules apply:
     * 
     * @param hostValue
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper asValue(Object hostValue) {
        return new ValueWrapper(__env__, getWrappedObject().asValue(hostValue));
    }

    /**
     * Close Context
     */
    @Signature
    public void close() {
        getWrappedObject().close();
    };

    /**
     * Closes the context and frees up potentially allocated native resources. A
     * context cannot free all native resources allocated automatically
     * 
     * @param cancelIfExecuting
     */
    @Signature
    public void close(boolean cancelIfExecuting) {
        getWrappedObject().close(cancelIfExecuting);
    };

    /**
     * Explicitly enters the context on the current thread. A context needs to be
     * entered and left for any operation to be performed. For example, before and
     * after invoking the execute method. This can be inefficient if a very high
     * number of simple operations needs to be performed. By entering and leaving
     * once explicitly, the overhead for entering/leaving the context for each
     * operation can be eliminated. Contexts can be entered multiple times on the
     * same thread.
     */
    @Signature
    public void enter() {
        getWrappedObject().enter();
    };

    /**
     * Evaluates a guest language code literal, using a provided language id. The
     * result is accessible as value and never returns null. The provided
     * CharSequence must represent an immutable String.
     * 
     * @param languageId
     * @param source
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper eval(String languageId, CharSequence source) {
        return new ValueWrapper(__env__, getWrappedObject().eval(languageId, source));
    };

    /*
     * /** Загрузка файла из разных мест
     * 
     * @param sourse
     * 
     * @return
     * 
     * @Signature public ValueWrapper eval(Source sourse) { return new
     * ValueWrapper(__env__, getWrappedObject().eval(sourse)); };
     */

    /**
     * Returns a value that represents the top-most bindings of a language. The top
     * most bindings of the language returns a member for a symbol in the scope.
     * Languages may allow modifications of members of the returned bindings object
     * at the language's discretion. If the language has not been initialized yet,
     * it will be initialized when the bindings are requested.
     * 
     * @param languageId
     * @return
     */
    @Signature
    public ValueWrapper getBindings(String languageId) {
        return new ValueWrapper(__env__, getWrappedObject().getBindings(languageId));
    };

    /**
     * ! Доработать. Instances of the class Class represent classes and interfaces
     * in a running Java application. An enum is a kind of class and an annotation
     * is a kind of interface. Every array also belongs to a class that is reflected
     * as a Class object that is shared by all arrays with the same element type and
     * number of dimensions. The primitive Java types (boolean, byte, char, short,
     * int, long, float, and double), and the keyword void are also represented as
     * Class objects.
     * 
     * Class has no public constructor. Instead Class objects are constructed
     * automatically by the Java Virtual Machine as classes are loaded and by calls
     * to the defineClass method in the class loader.
     * 
     * @param languageId
     * @return
     */
    @Signature
    public Class<? extends Context> getClass(String languageId) {
        return getWrappedObject().getClass();
    };

    /**
     * Provides access to meta-data about the underlying Graal engine.
     * 
     * @return Graal Engine being used by this context
     */
    @Signature
    public EngineWrapper getEngine() {
        return new EngineWrapper(__env__, getWrappedObject().getEngine());
    };

    /**
     * Returns polyglot bindings that may be used to exchange symbols between the
     * host and guest languages. All languages have unrestricted access to the
     * polyglot bindings. The returned bindings object always has members and its
     * members are readable, writable and removable.
     * 
     * Guest languages may put and get members through language specific APIs. For
     * example, in JavaScript, symbols of the polyglot bindings can be accessed
     * using Polyglot.import("name") and set using Polyglot.export("name", value).
     * Please see the individual language reference on how to access these symbols.
     * 
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper getPolyglotBindings() {
        return new ValueWrapper(__env__, getWrappedObject().getPolyglotBindings());
    };

    /**
     * Блок Доработать!
     */

    /**
     * Returns a hash code value for the object. This method is supported for the
     * benefit of hash tables such as those provided by java.util.HashMap.
     */
    @Signature
    public int hashCode() {
        return getWrappedObject().hashCode();
    }

    /**
     * 
     * @param languageId
     * @return true if the language was initialized. Returns false if it was already
     *         initialized.
     */
    @Signature
    public boolean initialize(String languageId) {
        return getWrappedObject().initialize(languageId);
    }

    /**
     * Explicitly leaves the context on the current thread. The context must be
     * entered before calling this method.
     */
    @Signature
    public void leave() {
        getWrappedObject().leave();
    }

    /*
     * @Signature public void notify() { getWrappedObject().notify(); }
     */

    /*
     * @Signature public void notifyAll() { getWrappedObject().notifyAll(); }
     */

    /**
     * Resets all accumulators of resource limits for the associated context to
     * zero.
     */
    @Signature
    public void resetLimits() {
        getWrappedObject().resetLimits();
    }

    /**
     * Возможно будут ошибки
     */
    @Signature
    public String toString() {
        return getWrappedObject().toString();
    }

    /*
     * @Signature public void wait() { getWrappedObject().wait(); }
    */

    /**
     * Удалю как руки дойдут
     */
    @Signature
    public boolean equals(Object obj) {
        return  getWrappedObject().equals(obj);
    }

}