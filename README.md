# AI_OOP_Architecture
An example of OOP Architecture for AI implementations

## Java SDK
Implemented and tested with Java SDK 12.0.2

## Build and Run
```bash
javac AI_OOP_Architecture.java
java AI_OOP_Architecture.java -file:testfile.csv -type:decisiontree -libr:tensorflow
```

#### Args
- file: Filename
- type: ML Algorithm Type
- libr: ML Library

## Cleaning Build
```bash
rm $(find . -name "*.class")
```
