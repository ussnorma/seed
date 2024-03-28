job('HW-20-1') {
  steps {
        shell('git clone https://github.com/ussnorma/seed.git && ls -la ./seed && rm -rf ./seed')
  }
}