import groovy.xml.MarkupBuilder

def mb = new MarkupBuilder()
mb.root{
    movie{
        title('kino1')
        type('story')
        format('DVD')
        stars('8')
    }
    movie{
        title('kino2')
        type('comedy')
        format('HD')
        stars('10')
    }
}
