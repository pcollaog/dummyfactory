dummyfactory
============

develop : [![Build Status](https://secure.travis-ci.org/pcollaog/dummyfactory.png?branch=develop)](http://travis-ci.org/pcollaog/dummyfactory)
master  : [![Build Status](https://secure.travis-ci.org/pcollaog/dummyfactory.png?branch=master)](http://travis-ci.org/pcollaog/dummyfactory)


Create instance for dummy objects, for now just support primitive types.

Examples
--------

Short:
```java
Short randomValue = DummyFactory.createDummy(Short.class);
```

Integer:
```java
Integer randomValue = DummyFactory.createDummy(Integer.class);
```

Double:
```java
Double randomValue = DummyFactory.createDummy(Double.class);
```

Long:
```java
Long randomValue = DummyFactory.createDummy(Long.class);
```

Boolean:
```java
Boolean randomValue = DummyFactory.createDummy(Boolean.class);
```

String
```java
String randomValue = DummyFactory.createDummy(String.class);
```

Character
```java
Character randomValue = DummyFactory.createDummy(Character.class);
```

Byte
```java
Byte randomValue = DummyFactory.createDummy(Byte.class);
```

BigDecimal
```java
BigDecimal randomValue = DummyFactory.createDummy(BigDecimal.class);
```

BigInteger
```java
BigInteger randomValue = DummyFactory.createDummy(BigInteger.class);
```

Support for DTO/JavaBeans
-------------------------

```java
MyDTO myDTO = DummyFactory.createDummy(MyDTO.class)
```

MyDTO must have a default constructor and setter for any attribute.
