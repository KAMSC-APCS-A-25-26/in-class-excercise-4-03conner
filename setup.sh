#!/bin/bash

# ICE-4 Assignment Setup Script
echo "Setting up ICE-4 Assignment..."

# Make sure we're in the right directory
if [ ! -f "pom.xml" ]; then
    echo "❌ Error: pom.xml not found. Make sure you're in the ICE-4 directory."
    exit 1
fi

# Compile the project
echo "📦 Compiling project..."
mvn clean compile

if [ $? -eq 0 ]; then
    echo "✅ Compilation successful!"
else
    echo "❌ Compilation failed. Please check your code."
    exit 1
fi

# Run tests
echo "🧪 Running tests..."
mvn test

if [ $? -eq 0 ]; then
    echo "✅ All tests passed!"
else
    echo "❌ Some tests failed. Check the output above for details."
fi

# Run the program
echo "🎮 Running ICE-4 Assignment..."
echo "Note: You can interact with the program now."
mvn exec:java -Dexec.mainClass="GuessingGame"

echo "Setup complete! 🎉"
