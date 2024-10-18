# The Kotlin compiler and options
KOTLINC = kotlinc
KOTLIN_OPTS = -include-runtime

# The name of the Kotlin source file
DIAMOND_SRC = Diamond.kt

# The name of the output jar file
DIAMOND_JAR = diamond.jar

# Default rule: build and run the diamond program
all: diamond

# Rule to build and run the diamond program
diamond: $(DIAMOND_SRC)
	$(KOTLINC) $(DIAMOND_SRC) $(KOTLIN_OPTS) -d $(DIAMOND_JAR)
	java -jar $(DIAMOND_JAR)

# Clean up the generated jar file
clean:
	rm -f $(DIAMOND_JAR)
