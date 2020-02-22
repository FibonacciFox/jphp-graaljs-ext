# Context

- **class** `Context` (`graaljs\Context`)
- **source** `php/graaljs/Context.php`

---

#### Methods

- `->`[`__construct()`](#method-__construct)
- `->`[`create()`](#method-create) - _Creates a context with default configuration._
- `->`[`getCurrent()`](#method-getcurrent) - _Returns the currently entered polyglot context._
- `->`[`newBuilder()`](#method-newbuilder) - _Creates a builder for constructing a context with custom configuration._
- `->`[`asValue()`](#method-asvalue) - _Converts a host value to a polyglot value representation._
- `->`[`close()`](#method-close) - _Closes this context and frees up potentially allocated native resources._
- `->`[`enter()`](#method-enter) - _Explicitly enters the context on the current thread._
- `->`[`eval()`](#method-eval) - _Evaluates a guest language code literal, using a provided language id. The_
- `->`[`getBindings()`](#method-getbindings) - _Returns a value that represents the top-most bindings of a language._
- `->`[`getEngine()`](#method-getengine) - _Provides access to meta-data about the underlying Graal engine._
- `->`[`getPolyglotBindings()`](#method-getpolyglotbindings) - _Returns polyglot bindings that may be used to exchange symbols between the_

---
# Methods

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

---

<a name="method-getengine"></a>

### getEngine()
```php
getEngine(): Engine
```
Provides access to meta-data about the underlying Graal engine.

---

<a name="method-getpolyglotbindings"></a>

### getPolyglotBindings()
```php
getPolyglotBindings(): Value
```
Returns polyglot bindings that may be used to exchange symbols between the
host and guest languages. All languages have unrestricted access to the
polyglot bindings. The returned bindings object always has members and its
members are readable, writable and removable.

Guest languages may put and get members through language specific APIs. For
example, in JavaScript, symbols of the polyglot bindings can be accessed
using Polyglot.import("name") and set using Polyglot.export("name", value).
Please see the individual language reference on how to access these symbols.