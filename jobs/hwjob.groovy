job('HW-20-1') {
  steps {
      folder('dir1') {
        shell('git clone https://github.com/ussnorma/seed.git && ls -la ./seed && rm -rf ./seed')
    }
  }
}