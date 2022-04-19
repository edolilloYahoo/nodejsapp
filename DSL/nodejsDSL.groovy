job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/edolilloYahoo/nodejsapp.git', 'master') { node ->
            node / gitConfigName('edolillo')
            node / gitConfigEmail('edolillo@ymail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    publishers {
    }
}
