job('Seed All') {
  scm {
    git ('https://github.com/ussnorma/seed.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}