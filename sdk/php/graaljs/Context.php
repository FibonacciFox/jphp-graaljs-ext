<?php

namespace php\graaljs;


abstract class Context
{
    /**
     * 
     * @param array $permittedLanguages
     * 
     * @return Context
     */
    public function __construct(array $permittedLanguages = null)
    {
    }

    /**
     * Creates a context with default configuration.
     * 
     * @param array $permittedLanguages
     * @return Context
     */
    public function create(array $permittedLanguages = null)
    {
    }

    /**
     * Returns the currently entered polyglot context.
     * 
     * @return Context 
     */
    public function getCurrent()
    {
    }

    /**
     * Creates a builder for constructing a context with custom configuration.
     * 
     * @param array $permittedLanguages
     * @return Builder
     */
    public function newBuilder(array $permittedLanguages = null)
    {
    }

    /**
     * Converts a host value to a polyglot value representation.
     * 
     * @param object $object
     * @return Value
     */
    public function asValue(object $object)
    {
    }

    /**
     * Closes this context and frees up potentially allocated native resources. 
     * A context may not free all native resources allocated automatically.
     */
    public function close(bool $cancelIfExecuting = null)
    {
    }

    /**
     * Explicitly enters the context on the current thread. 
     * A context needs to be entered and left for any operation to be performed.
     */
    public function enter()
    {
    }

    /**
     * Evaluates a guest language code literal, using a provided language id. The
     * result is accessible as value and never returns null. The provided
     * CharSequence must represent an immutable String.
     * 
     * @param string $languageId
     * @param string $sourse
     * @return Value
     */

    public function eval(string $languageId, string $source)
    {
    }

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
     * Returns a value that represents the top-most bindings of a language. 
     * 
     * @param string $languageId
     * @return Value
     */
    public function getBindings(string $languageId)
    {
    }

    /**
     * Provides access to meta-data about the underlying Graal engine.
     * 
     * @return Engine 
     */
    public function getEngine()
    {
    }

    /**
     * Returns polyglot bindings that may be used to exchange symbols between the
     * host and guest languages. All languages have unrestricted access to the
     * polyglot bindings.
     * @return Value
     */
    public function getPolyglotBindings()
    {
    }
}
