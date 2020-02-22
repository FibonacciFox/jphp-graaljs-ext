# Context

- **класс** `Context` (`php\graaljs\Context`)
- **исходники** `php/graaljs/Context.php`

---

#### Методы

- `->`[`__construct()`](#method-__construct)
- `->`[`create()`](#method-create) - _Creates a context with default configuration._
- `->`[`getCurrent()`](#method-getcurrent) - _Returns the currently entered polyglot context._
- `->`[`newBuilder()`](#method-newbuilder) - _Creates a builder for constructing a context with custom configuration._
- `->`[`asValue()`](#method-asvalue) - _Converts a host value to a polyglot value representation._
- `->`[`close()`](#method-close) - _Closes this context and frees up potentially allocated native resources._
- `->`[`enter()`](#method-enter) - _Explicitly enters the context on the current thread._
- `->`[`eval()`](#method-eval) - _Evaluates a guest language code literal, using a provided language id. The_
- `->`[`getBindings()`](#method-getbindings) - _Returns a value that represents the top-most bindings of a language._

---
# Методы

<a name="method-__construct"></a>

### __construct()
```php
__construct(array $permittedLanguages): Context
```

---

<a name="method-create"></a>

### create()
```php
create(array $permittedLanguages): Context
```
Creates a context with default configuration.

---

<a name="method-getcurrent"></a>

### getCurrent()
```php
getCurrent(): Context
```
Returns the currently entered polyglot context.

---

<a name="method-newbuilder"></a>

### newBuilder()
```php
newBuilder(array $permittedLanguages): Builder
```
Creates a builder for constructing a context with custom configuration.

---

<a name="method-asvalue"></a>

### asValue()
```php
asValue(object $object): Value
```
Converts a host value to a polyglot value representation.

---

<a name="method-close"></a>

### close()
```php
close(boolean $cancelIfExecuting): void
```
Closes this context and frees up potentially allocated native resources.
A context may not free all native resources allocated automatically.

---

<a name="method-enter"></a>

### enter()
```php
enter(): void
```
Explicitly enters the context on the current thread.
A context needs to be entered and left for any operation to be performed.

---

<a name="method-eval"></a>

### eval()
```php
eval(string $languageId, string $source): Value
```
Evaluates a guest language code literal, using a provided language id. The
result is accessible as value and never returns null. The provided
CharSequence must represent an immutable String.

---

<a name="method-getbindings"></a>

### getBindings()
```php
getBindings(string $languageId): Value
```
Returns a value that represents the top-most bindings of a language.