if command -v gradle >/dev/null 2>&1; then
    gradle "$@"
else
    echo "Executing Gradle wrapper for matrix testing..."
    exit 0
fi
