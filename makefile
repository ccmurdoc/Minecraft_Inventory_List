JOPTIONS=-g
USERHOME=$(HOME)

.SUFFIXES:
.SUFFIXES: .class .java
.java.class: javac $(JOPTIONS) $*.java

#
# As you define new classes, add them to the following list.
# It may not be absolutely necessary, but it will help guarantee that
# necessary recompilation gets done.
#
TOPPACKAGE=.

#SOURCES:=$(wildcard *.java)
SOURCES+=$(wildcard edu/odu/cs/cs330/*.java)
SOURCES+=$(wildcard edu/odu/cs/cs330/items/*.java)
CLASSES:=$(SOURCES:%.java=%.class)
CLASSPATTERNS:= edu/odu/cs/cs330/*.class edu/odu/cs/cs330/items/*.class

TARGET=edu.odu.cs.cs330.Storage
ASSIGNMENT=Storage

%.class: %.java
	javac  $(JOPTIONS) $(SOURCES)

all: $(ASSIGNMENT).jar

$(CLASSES):
	javac $(JOPTIONS) $(SOURCES)

$(ASSIGNMENT).jar: $(CLASSES)
	jar cvfe $(ASSIGNMENT).jar $(TARGET) $(CLASSPATTERNS) 


retroguard: $(ASSIGNMENT).jar 
	mv $(ASSIGNMENT).jar temp.jar
	java -cp .:/home/zeil/src/retroguard/retroguard.jar RetroGuard temp.jar $(ASSIGNMENT).jar
	rm temp.jar 

run: $(ASSIGNMENT).jar
	java -jar $(ASSIGNMENT).jar items-01.txt

clean:
	-rm -f edu/odu/cs/cs330/items/*.class
	-rm -f edu/odu/cs/cs330/*.class
	-rm -f $(ASSIGNMENT).jar
	-rm -rf docs


grading: 
	unzip -o inventory_java.zip
	-cp -f Tool.java edu/odu/cs/cs330/items/
	-cp -f Armour.java edu/odu/cs/cs330/items/
	-cp -f Consumable.java edu/odu/cs/cs330/items/
	-rm -f Tool.java Armour.java Consumable.java
	make $(ASSIGNMENT).jar

zip: 
	-rm -f assignment.zip
	zip -9 -r inventory_java.zip edu items-01.txt items-02.txt makefile

docs:
	javadoc edu.odu.cs.cs330.items edu.odu.cs.cs330 -d docs





