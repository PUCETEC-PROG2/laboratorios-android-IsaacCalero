package ec.edu.puce.githubclient.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.components.RepoIt

@Composable

fun RepoLs () {
    Column (
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 48.dp)
    ) {
        RepoIt(
            name = "Repositorio Gitlab",
            description = "Proyecto de Gitlab de Isaac",
            avatarImg = "https://www.wearetriple.com/media/5v0o4wuh/max-verstappen-lion.jpg?width=1240&v=1d6f3436c839750",
            language = "Github"
        )
        RepoIt(
            name = "Repositorio Proyecto Integrador",
            description = "Proyecto Integrador Final",
            avatarImg = "https://www.wearetriple.com/media/5v0o4wuh/max-verstappen-lion.jpg?width=1240&v=1d6f3436c839750",
            language = "TypeScript"
        )
        RepoIt(
            name = "Repositorio Ecoguide",
            description = "Proyecto Dev Challenge",
            avatarImg = "https://www.wearetriple.com/media/5v0o4wuh/max-verstappen-lion.jpg?width=1240&v=1d6f3436c839750",
            language = "React"
        )
        RepoIt(
            name = "Repositorio AuraSong",
            description = "Proyecto Integrador de Musica",
            avatarImg = "https://www.wearetriple.com/media/5v0o4wuh/max-verstappen-lion.jpg?width=1240&v=1d6f3436c839750",
            language = "Django"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RepoLsreview() {
    RepoLs()
}