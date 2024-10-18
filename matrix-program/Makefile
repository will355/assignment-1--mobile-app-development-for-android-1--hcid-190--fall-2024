# The Kotlin compiler and options
KOTLINC = kotlinc
KOTLIN_OPTS = -include-runtime

# The name of the Kotlin source file
MATRIX_SRC = Matrix.kt

# The name of the output jar file
MATRIX_JAR = matrix.jar

# Default rule: build and run the matrix program
all: matrix

# Rule to build and run the matrix program
matrix: $(MATRIX_SRC)
	$(KOTLINC) $(MATRIX_SRC) $(KOTLIN_OPTS) -d $(MATRIX_JAR)
	java -jar $(MATRIX_JAR)

# Clean up the generated jar file
clean:
	rm -f $(MATRIX_JAR)
