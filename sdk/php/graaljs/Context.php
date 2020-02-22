<?php

namespace php\graaljs;

/**
 * Краткое описание класса
 * 
 * Подробное описание класса
 * которое может растянуться на несколько строк с использованием HTML тегов.
 * Теги можно использовать следующие:
 * <b> — жирное начертание;
 * <code> — код;
 * <br> — разрыв строки;
 * <i> — курсив;
 * <kbd> — сочетание клавиш;
 * <li> — элемент списка;
 * <ol> — нумерованный список;
 * <p> — абзац;
 * <pre> — форматированный текст;
 * <samp> — пример;
 */
abstract class Context
{
    /**
     * @param string $permittedLanguages
     * 
     * @return Context {}
     */
    public function __construct(string $permittedLanguages = null)
    {
    }
}
