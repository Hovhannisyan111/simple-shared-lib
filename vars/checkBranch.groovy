def call() {
    if (env.BRANCH_NAME == "main") {
        echo "🚀 Production branch detected"
    } else {
        echo "⚠️ Non-production branch"
    }
}
