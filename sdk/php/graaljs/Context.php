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
     * Creates a context with default configuration.
     * 
     * @param array $permittedLanguages
     * @return Builder
     */
    public function newBuilder(array $permittedLanguages = null)
    {
    }

    




}
