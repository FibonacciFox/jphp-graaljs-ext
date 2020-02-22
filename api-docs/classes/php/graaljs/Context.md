# Context

- **class** `Context` (`php\graaljs\Context`)
- **source** `php/graaljs/Context.php`

---

#### Methods

- `->`[`__construct()`](#method-__construct)
- `->`[`create()`](#method-create) - _Creates a context with default configuration._
- `->`[`getCurrent()`](#method-getcurrent) - _Returns the currently entered polyglot context._
- `->`[`newBuilder()`](#method-newbuilder) - _Creates a context with default configuration._

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
Creates a context with default configuration.