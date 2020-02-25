#### **English** / [Русский](api-docs/README.ru.md)

---

## jphp-graaljs-ext
> version 1.0.0, created by JPPM.

GraalVM JavaScript API

### Install
```
jppm add jphp-graaljs-ext@1.0.0
```

### API
**Classes**

#### `php\graaljs`

- [`Builder`](https://github.com/FibonacciFox/jphp-graaljs-ext/tree/master/api-docs/classes/php/graaljs/Builder.md)
- [`Context`](https://github.com/FibonacciFox/jphp-graaljs-ext/tree/master/api-docs/classes/php/graaljs/Context.md)
- [`Engine`](https://github.com/FibonacciFox/jphp-graaljs-ext/tree/master/api-docs/classes/php/graaljs/Engine.md)

```php
<?php
Class ExtClass {
    
    $id = 123;
    $text = 'Hello Jphp';
    
    public function test(){
        return "jphp string";
    }
}
?>
```
```php
<?php
$Context = new Context();
    $newContext = $Context->newBuilder([])->allowAllAccess(true)->build();
    $newContext->getBindings("js")->putMember("ExtClass", new ExtClass());    
    $newContext->eval("js","print(ExtClass.getValue('id'));");
    $newContext->eval("js","ExtClass.setValue('id', 1000);");
    $newContext->eval("js","print(ExtClass.getValue('id'));");
    $newContext->eval("js","let func = ExtClass.invoke('test'); print(func);");
?>
```
