package org.develnext.jphp.ext.graaljs.classes;

import java.util.Set;

import org.develnext.jphp.ext.graaljs.GraalJsExtension;
import org.graalvm.polyglot.Value;

import php.runtime.annotation.Reflection.Final;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Name("Value")
@Namespace(GraalJsExtension.NS)
@Final
public class ValueWrapper extends BaseWrapper<Value> {

    /**
     * 
     * @param env
     * @param wrappedObject
     */
    public ValueWrapper(final Environment env, final Value wrappedObject) {
        super(env, wrappedObject);
    }

    /**
     * 
     * @param env
     * @param clazz
     */
    public ValueWrapper(final Environment env, final ClassEntity clazz) {
        super(env, clazz);
    }

    /**
     * Converts a Java host value to a polyglot value. Returns a value for any host
     * or guest value. If there is a context available use Context.asValue(Object)
     * for efficiency instead. The value is bound the current context when created.
     * If there is no context available when the value was constructed then Values
     * constructed with this method may return null for getContext().
     * 
     * @param hostValue the object to convert
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper asValue( Object hostValue) {

        return new ValueWrapper(__env__, Value.asValue(hostValue));
    }

    /**
     * Maps a polyglot value to a value with a given Java target type.
     * 
     * @param targetType
     * @return
     */
    @Signature
    public <T> T as(final Class<T> targetType) {
        return getWrappedObject().as(targetType);
    }

    /**
     * Returns a boolean representation of this value if it is boolean.
     * 
     * @return boolean
     */
    @Signature
    public boolean asBoolean() {
        return getWrappedObject().asBoolean();
    }

    /**
     * Returns a byte representation of this value if it is number and the value
     * fits.
     * 
     * @return byte
     */
    @Signature
    public byte asByte() {
        return getWrappedObject().asByte();
    }

    /**
     * Не работает в DN. Нужно писать Wrapper
     * 
     * @return LocalDate
     * 
     * @Signature public LocalDate asDate() { return getWrappedObject().asDate(); }
     */

    /**
     * Returns a double representation of this value if it is number and the value
     * fits.
     * 
     * @return double
     */
    @Signature
    public double asDouble() {
        return getWrappedObject().asDouble();
    }

    /**
     * Returns the receiver as duration if this object represents a duration.
     * 
     * @return Duration
     * 
     * @Signature public Duration asDuration() { return
     *            getWrappedObject().asDuration(); }
     */

    /**
     * Returns a float representation of this value if it is number and the value
     * fits.
     * 
     * @return float
     */
    @Signature
    public float asFloat() {
        return getWrappedObject().asFloat();
    }

    /**
     * Returns the original Java host language object.
     * 
     * @param <T>
     * @return
     */
    @Signature
    public <T> Object asHostObject() {
        return getWrappedObject().asHostObject();
    }

    /**
     * Returns the receiver as instant if this object represents an instant. If a
     * value is an instant then it is also a date, time and timezone. Using this
     * method may be more efficient than reconstructing the timestamp from the date,
     * time and timezone data.
     * 
     * @return
     * 
     * @Signature public Instant asInstant() { return
     *            getWrappedObject().asInstant(); }
     */

    /**
     * Returns an int representation of this value if it is number and the value
     * fits.
     * 
     * @return int
     */
    @Signature
    public int asInt() {
        return getWrappedObject().asInt();
    }

    /**
     * Returns a long representation of this value if it is number and the value
     * fits.
     * 
     * @return long
     */
    @Signature
    public long asLong() {
        return getWrappedObject().asLong();
    }

    

    /**
     * Returns the value of the pointer as long value.
     * 
     * @return long
     */
    @Signature
    public long asNativePointer() {
        return getWrappedObject().asNativePointer();
    }

    /**
     * Нужен Врапер
     * 
     * @return
     * 
     * @Signature public Proxy asProxyObject() { return
     *            getWrappedObject().asProxyObject(); }
     */

    /**
     * Returns a short representation of this value if it is number and the value
     * fits.
     * 
     * @return
     */
    @Signature
    public short asShort() {
        return getWrappedObject().asShort();
    }

    /**
     * Returns the String value if this value is a string. This method returns null
     * if this value represents a null value.
     * 
     * @return String
     */
    @Signature
    public String asString() {
        return getWrappedObject().asString();
    }

    /**
     * Returns the receiver as time if this object represents a time. The returned
     * time is either aware if the receiver has a timezone otherwise it is naive.
     * 
     * @return LocalTime
     * 
     * @Signature public LocalTime asTime() { return getWrappedObject().asTime(); }
     */

    /**
     * Нужен Враппер Returns the receiver as timestamp if this object represents a
     * timezone.
     * 
     * @return ZoneId
     * 
     * @Signature public ZoneId asTimeZone() { return
     *            getWrappedObject().asTimeZone(); }
     */

    /**
     * Возвращает true, если Value может быть выполнено.
     * 
     * @return boolean
     */
    @Signature
    public boolean canExecute() {
        return getWrappedObject().canExecute();
    }

    /**
     * Returns true if the value can be instantiated. This indicates that the
     * newInstance(Object) can be used with this value.
     * 
     * @return boolean
     */
    @Signature
    public boolean canInstantiate() {
        return getWrappedObject().canInstantiate();
    }

    /**
     * Returns true if the given member exists and can be invoked. Returns false if
     * the member does not exist (hasMember(String) returns false), or is not
     * invocable.
     * 
     * @param identifier identifier the member identifier
     * @return
     */
    @Signature
    public boolean canInvokeMember(final String identifier) {
        return getWrappedObject().canInvokeMember(identifier);
    }

    /**
     * @return boolean
     */
    @Signature
    public boolean equals(Object obj) {
        return getWrappedObject().equals(obj);
    }

    /**
     * Executes this value if it can be executed and returns its result. If no
     * result value is expected or needed use executeVoid(Object) for better
     * performance. All arguments are subject to polyglot value mapping rules as
     * described in Context.asValue(Object).
     * 
     * @param Object... arguments
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper execute(Object... arguments) {
        return new ValueWrapper(__env__, getWrappedObject().execute(arguments));
    }

    /**
     * Executes this value if it can be executed. All arguments are subject to
     * polyglot value mapping rules as described in Context.asValue(Object).
     * 
     * @param arguments
     */
    @Signature
    public void executeVoid(Object... arguments) {
        getWrappedObject().executeVoid(arguments);
    }

    /**
     * Returns true if this value represents a number and the value fits in byte,
     * else false.
     * 
     * @return boolean
     */
    @Signature
    public boolean fitsInByte() {
        return getWrappedObject().fitsInByte();
    }

    /**
     * Returns true if this value represents a number and the value fits in double,
     * else false.
     * 
     * @return boolean
     */
    @Signature
    public boolean fitsInDouble() {
        return getWrappedObject().fitsInDouble();
    }

    /**
     * Returns true if this value represents a number and the value fits in float,
     * else false.
     * 
     * @return boolean
     */
    @Signature
    public boolean fitsInFloat() {
        return getWrappedObject().fitsInFloat();
    }

    /**
     * Returns true if this value represents a number and the value fits in int,
     * else false.
     * 
     * @return boolean
     */
    @Signature
    public boolean fitsInInt() {
        return getWrappedObject().fitsInInt();
    }

    /**
     * Returns true if this value represents a number and the value fits in long,
     * else false.
     * 
     * @return boolean
     */
    @Signature
    public boolean fitsInLong() {
        return getWrappedObject().fitsInLong();
    }

    /**
     * Returns true if this value represents a number and the value fits in short,
     * else false.
     * 
     * @return
     */
    @Signature
    public boolean fitsInShort() {
        return getWrappedObject().fitsInShort();
    }

    /**
     * Returns the array element of a given index. Polyglot arrays start with index
     * 0, independent of the guest language. The given array index must be greater
     * or equal to 0.
     * 
     * @param index
     * @return
     */
    @Signature
    public ValueWrapper getArrayElement(long index) {
        return new ValueWrapper(__env__, getWrappedObject().getArrayElement(index));
    }

    /**
     * Returns the array size for values with array elements.
     * 
     * @return long
     */
    @Signature
    public long getArraySize() {
        return getWrappedObject().getArraySize();
    }

    /**
     * Доработать!
     *
     * @Signature public Class<? extends Value> getClass() { return
     *            getWrappedObject().getClass(); }
     */

    /**
     * Returns the context this value was created with. The returned context may be
     * null if the value was created using Value.asValue(Object) and no current
     * context was entered at the time.
     * 
     * The returned context can not be used to enter , leave or close the context or
     * engine. Invoking such methods will cause an IllegalStateException to be
     * thrown. This ensures that only the creator of a context is allowed to enter,
     * leave or close a context and that a context is not closed while it is still
     * active.
     * 
     * @return ContextWrapper
     */
    @Signature
    public ContextWrapper getContext() {
        return new ContextWrapper(__env__, getWrappedObject().getContext());
    }

    /**
     * Returns the member with a given identifier or null if the member does not
     * exist.
     * 
     * @param identifier
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper getMember(String identifier) {
        return new ValueWrapper(__env__, getWrappedObject().getMember(identifier));
    }

    /**
     * Returns a set of all member keys. Calling Set.contains(Object) with a string
     * key is equivalent to calling hasMember(String). Removing an element from the
     * returned set is equivalent to calling removeMember(String). Adding an element
     * to the set is equivalent to calling putMember(key, null). If the value does
     * not support members then an empty unmodifiable set is returned. If the
     * context gets closed while the returned set is still alive, then the set will
     * throw an IllegalStateException if any methods except Object methods are
     * invoked.
     * 
     * @return
     */
    @Signature
    public Set<String> getMemberKeys() {
        return getWrappedObject().getMemberKeys();
    }

    /**
     * Returns the meta representation of this polyglot value. The interpretation of
     * this function differs for each guest language. A language agnostic way to get
     * to a type name is: value.getMetaObject().toString(). If a language does not
     * provide any meta object information, null is returned.
     * 
     * @return
     */
    @Signature
    public ValueWrapper getMetaObject() {
        return new ValueWrapper(__env__, getWrappedObject().getMetaObject());
    }

    /**
     * Требуется обертка Description of contiguous section of text within a Source
     * of program code.; supports multiple modes of access to the text and its
     * location. Two available source sections are considered equal if their
     * sources, start and length are equal. Unavailable source sections are compared
     * by identity. Source sections are designed to be used as keys in hash maps
     * 
     * @return
     * 
     * @Signature public SourceSection getSourceLocation() { return
     *            getWrappedObject().getSourceLocation(); }
     * 
     */

    /**
     * Returns true if this polyglot value has array elements. In this case array
     * elements can be accessed using getArrayElement(long), setArrayElement(long,
     * Object), removeArrayElement(long) and the array size can be queried using
     * getArraySize().
     * 
     * @return boolean
     */
    @Signature
    public boolean hasArrayElements() {
        return getWrappedObject().hasArrayElements();
    }

    /**
     * Returns true if such a member exists for a given identifier. If the value has
     * no members then hasMember(String) returns false.
     * 
     * @param identifier
     * @return boolean
     */
    @Signature
    public boolean hasMember(String identifier) {
        return getWrappedObject().hasMember(identifier);
    }

    /**
     * Returns true if this value generally supports containing members. To check
     * whether a value has no members use getMemberKeys().isEmpty() instead. If
     * polyglot value has members, it may also support getMember(String),
     * putMember(String, Object) and removeMember(String).
     * 
     * @return boolean
     */
    @Signature
    public boolean hasMember() {
        return getWrappedObject().hasMembers();
    }

    /**
     * Returns a hash code value for the object. This method is supported for the
     * benefit of hash tables such as those provided by java.util.HashMap.
     * 
     * @return int
     */
    @Signature
    public int hashCode() {
        return getWrappedObject().hashCode();
    }

    /**
     * Invokes the given member of this value. Unlike execute(Object), this is an
     * object oriented execution of a member of an object. To test whether
     * invocation is supported, call canInvokeMember(String). When object oriented
     * semantics are not supported, use getMember(String).execute(Object...)
     * instead.
     * 
     * @param identifier
     * @param arguments
     * @return ValueWrapper
     */
    @Signature
    public ValueWrapper invokeMember(String identifier, Object... arguments) {
        return new ValueWrapper(__env__, getWrappedObject().invokeMember(identifier, arguments));
    }

    /**
     * Returns true if this value represents a boolean value.
     * 
     * @return boolean
     */
    @Signature
    public boolean isBoolean() {
        return getWrappedObject().isBoolean();
    }

    /**
     * Returns true if this object represents a date, else false. If the receiver is
     * also a timezone then the date is aware, otherwise it is naive.
     * 
     * @return boolean
     */
    @Signature
    public boolean isDate() {
        return getWrappedObject().isDate();
    }

    @Signature
    public boolean isDuration() {
        return getWrappedObject().isDuration();
    }

    @Signature
    public boolean isException() {
        return getWrappedObject().isException();
    }

    @Signature
    public boolean isHostObject() {
        return getWrappedObject().isHostObject();
    }

    @Signature
    public boolean isInstant() {
        return getWrappedObject().isInstant();
    }

    @Signature
    public boolean isNativePointer() {
        return getWrappedObject().isNativePointer();
    }

    @Signature
    public boolean isNull() {
        return getWrappedObject().isNull();
    }

    @Signature
    public boolean isNumber() {
        return getWrappedObject().isNumber();
    }

    @Signature
    public boolean isProxyObject() {
        return getWrappedObject().isProxyObject();
    }

    @Signature
    public boolean isString() {
        return getWrappedObject().isString();
    }

    @Signature
    public boolean isTime() {
        return getWrappedObject().isTime();
    }

    @Signature
    public boolean isTimeZone() {
        return getWrappedObject().isTimeZone();
    }

    @Signature
    public ValueWrapper newInstance(Object... arguments) {
        return new ValueWrapper(__env__, getWrappedObject().newInstance(arguments));
    }

    /*
     * Доработать!
     * 
     * @Signature public void notify() { getWrappedObject().notify(); }
     */

    /*
     * Доработать! public void notifyAll() { getWrappedObject().notifyAll(); }
     */

    /**
     * !Возможно будут проблемы Sets the value of a member using an identifier. The
     * member value is subject to polyglot value mapping rules as described in
     * Context.asValue(Object).
     * 
     * @param identifier
     * @param value
     */
    @Signature
    public void putMember(String identifier, Object value) {
        getWrappedObject().putMember(identifier, value);
    }

    /**
     * Removes an array element at a given index. Returns true if the underlying
     * array element could be removed, otherwise false.
     * 
     * @param index
     * @return boolean
     */
    @Signature
    public boolean removeArrayElement(long index) {
        return getWrappedObject().removeArrayElement(index);
    }

    /**
     * Removes a single member from the object. Returns true if the member was
     * successfully removed, false if such a member does not exist.
     * 
     * @param identifier
     * @return
     */
    @Signature
    public boolean removeMember(String identifier) {
        return getWrappedObject().removeMember(identifier);
    }

    /*
     * @Signature public RuntimeException throwException() { return
     * getWrappedObject().throwException(); }
     */

    @Signature
    public String toString() {
        return getWrappedObject().toString();
    }

    /**
     * ! Возможны ошибки Sets the value at a given index. Polyglot arrays start with
     * index 0, independent of the guest language. The array element value is
     * subject to polyglot value mapping rules as described in
     * Context.asValue(Object).
     * 
     * @param index
     * @param value
     */
    @Signature
    public void setArrayElement(long index, Object value) {
        getWrappedObject().setArrayElement(index, value);
    }

    /*
     * public void wait() { getWrappedObject().wait(); } public void wait(long,
     * timeout) { getWrappedObject().wait(timeout); } public void wait(long
     * timeout,int nanos) { getWrappedObject().wait(timeout, nanos); }
     */
}