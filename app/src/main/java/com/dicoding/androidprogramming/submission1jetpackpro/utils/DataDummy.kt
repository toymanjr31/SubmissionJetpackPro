package com.dicoding.androidprogramming.submission1jetpackpro.utils

import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.MovieEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.local.entity.ShowEntity
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.MovieResponse
import com.dicoding.androidprogramming.submission1jetpackpro.data.source.remote.response.ShowResponse

object DataDummy {
    fun generateDummyMovies(): List<MovieEntity>{
        val movies = ArrayList<MovieEntity>()

        movies.add(
                MovieEntity(
                        movieId = 399566,
                        movieTitle = "Godzilla vs. Kong",
                        movieDescription = "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                        moviePoster = "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 615678,
                        movieTitle = "Thunder Force",
                        movieDescription = "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city",
                        moviePoster = "/279yOM4OQREL36B3SECnRxoB4MZ.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 791373,
                        movieTitle = "Zack Snyder's Justice League",
                        movieDescription = "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                        moviePoster = "/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 460465,
                        movieTitle = "Mortal Kombat",
                        movieDescription = "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                        moviePoster = "/8yhtzsbBExY8mUct2GOk4LDDuGH.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 412656,
                        movieTitle = "Chaos Walking",
                        "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                        moviePoster = "/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 634528,
                        movieTitle = "The Marksman",
                        movieDescription = "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                        moviePoster = "/6vcDalR50RWa309vBH1NLmG2rjQ.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 527774,
                        movieTitle = "Raya and the Last Dragon",
                        movieDescription = "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                        moviePoster = "/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 664767,
                        movieTitle = "Mortal Kombat Legends: Scorpion's Revenge",
                        movieDescription = "After the vicious slaughter of his family by stone-cold mercenary Sub-Zero, Hanzo Hasashi is exiled to the torturous Netherrealm. There, in exchange for his servitude to the sinister Quan Chi, he’s given a chance to avenge his family – and is resurrected as Scorpion, a lost soul bent on revenge. Back on Earthrealm, Lord Raiden gathers a team of elite warriors – Shaolin monk Liu Kang, Special Forces officer Sonya Blade and action star Johnny Cage – an unlikely band of heroes with one chance to save humanity. To do this, they must defeat Shang Tsung’s horde of Outworld gladiators and reign over the Mortal Kombat tournament.",
                        moviePoster = "/4VlXER3FImHeFuUjBShFamhIp9M.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 458576,
                        movieTitle = "Monster Hunter",
                        movieDescription = "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                        moviePoster = "/1UCOF11QCw8kcqvce8LKOO6pimh.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 793723,
                        movieTitle = "Sentinelle",
                        movieDescription = "Transferred home after a traumatizing combat mission, a highly trained French soldier uses her lethal skills to hunt down the man who hurt her sister.",
                        moviePoster = "/fFRq98cW9lTo6di2o4lK1qUAWaN.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 644083,
                        movieTitle = "Twist",
                        movieDescription = "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
                        moviePoster = "/29dCusd9PwHrbDqzxNG35WcpZpS.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 587807,
                        movieTitle = "Tom & Jerry",
                        movieDescription = "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                        moviePoster = "/6KErczPBROQty7QoIsaa6wJYXZi.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 544401,
                        movieTitle = "Cherry",
                        movieDescription = "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
                        moviePoster = "/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 587996,
                        movieTitle = "Bajocero",
                        movieDescription = "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                        moviePoster = "/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 464052,
                        movieTitle = "Wonder Woman 1984",
                        movieDescription = "A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious ancient force that puts her powers in jeopardy.",
                        moviePoster = "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 581389,
                        movieTitle = "승리호",
                        movieDescription = "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake.",
                        moviePoster = "/p9YDHJKvUoi7v2SCd3vLGPae1Xp.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 632357,
                        movieTitle = "The Unholy",
                        movieDescription = "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                        moviePoster = "/b4gYVcl8pParX8AjkN90iQrWrWO.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 615457,
                        movieTitle = "Nobody",
                        movieDescription = "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                        moviePoster = "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 755812,
                        movieTitle = "Miraculous World: New York, United HeroeZ",
                        movieDescription = "During a school field trip, Ladybug and Cat Noir meet the American superheroes, whom they have to save from an akumatised super-villain. They discover that Miraculous exist in the United States too.",
                        moviePoster = "/zNxqXCEEBllgbVOCuHLPasNsovt.jpg"
                )
        )
        movies.add(
                MovieEntity(
                        movieId = 522444,
                        movieTitle = "Black Water: Abyss",
                        movieDescription = "An adventure-loving couple convince their friends to explore a remote, uncharted cave system in the forests of Northern Australia. With a tropical storm approaching, they abseil into the mouth of the cave, but when the caves start to flood, tensions rise as oxygen levels fall and the friends find themselves trapped. Unknown to them, the storm has also brought in a pack of dangerous and hungry crocodiles.",
                        moviePoster = "/95S6PinQIvVe4uJAd82a2iGZ0rA.jpg"
                )
        )
        return movies
    }

    fun generateDummyShows(): List<ShowEntity>{
        val shows = ArrayList<ShowEntity>()

        shows.add(
                ShowEntity(
                        showId = 88396,
                        showTitle = "The Falcon and the Winter Soldier",
                        showDescription = "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                        showPoster = "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                )
        )

        shows.add(
                ShowEntity(
                        showId = 71712,
                        showTitle = "The Good Doctor",
                        showDescription = "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                        showPoster = "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 60735,
                        showTitle = "The Flash",
                        showDescription = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        showPoster = "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 95557,
                        showTitle = "Invincible",
                        showDescription = "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                        showPoster = "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 1416,
                        showTitle = "Grey's Anatomy",
                        showDescription = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        showPoster = "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 69050,
                        showTitle = "Riverdale",
                        showDescription = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        showPoster = "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                )
        )

        shows.add(
                ShowEntity(
                        showId = 63174,
                        showTitle = "Lucifer",
                        showDescription = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        showPoster = "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 85271,
                        showTitle = "WandaVision",
                        showDescription = "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        showPoster = "/glKDfE6btIRcVB5zrjspRIs4r52.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 1402,
                        showTitle = "The Walking Dead",
                        showDescription = "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        showPoster = "/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 120168,
                        showTitle = "¿Quién mató a Sara?",
                        showDescription = "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                        showPoster = "/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
                )
        )
        shows.add(
                ShowEntity(
                        showId = 95057,
                        showTitle = "Superman & Lois",
                        showDescription = "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                        showPoster = "/6SJppowm7cdQgLkvoTlnTUSbjr9.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 62286,
                        showTitle = "Fear the Walking Dead",
                        showDescription = "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        showPoster = "/4UjiPdFKJGJYdxwRs2Rzg7EmWqr.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 1399,
                        showTitle = "Game of Thrones",
                        showDescription = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                        showPoster = "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 71694,
                        showTitle = "Snowfall",
                        showDescription = "Los Angeles. 1983. A storm is coming and it's name is crack. Set against the infancy of the crack cocaine epidemic and its ultimate radical impact on the culture as we know it, the story follows numerous characters on a violent collision course.",
                        showPoster = "/orvFrLzqSeW5qTFpfJEbPfHRPWg.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 79460,
                        showTitle = "Legacies",
                        showDescription = "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                        showPoster = "/qTZIgXrBKURBK1KrsT7fe3qwtl9.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 77169,
                        showTitle = "Cobra Kai",
                        showDescription = "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                        showPoster = "/obLBdhLxheKg8Li1qO11r2SwmYO.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 91605,
                        showTitle = "I Am...",
                        showDescription = "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                        showPoster = "/oogunE22HDTcTxFakKQbwqfw1qo.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 79008,
                        showTitle = "Luis Miguel: La Serie",
                        showDescription = "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                        showPoster = "/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 44217,
                        showTitle = "Vikings",
                        showDescription = "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                        showPoster = "/bQLrHIRNEkE3PdIWQrZHynQZazu.jpg"
                )
        )

        shows.add(
                ShowEntity(
                        showId = 100617,
                        showTitle = "Transformers: War for Cybertron: Siege",
                        showDescription = "On their dying planet, the Autobots and Decepticons battle fiercely for control of the AllSpark in the Transformers universe's origin story.",
                        showPoster = "/14B6I4FxCMiDoPOwzj27EcqqY6i.jpg"
                )
        )
        return shows
    }

    fun generateDummyMovieResponse(): List<MovieResponse>{
        val movies = ArrayList<MovieResponse>()

        movies.add(
                MovieResponse(
                        id = 399566,
                        originalTitle = "Godzilla vs. Kong",
                        overview = "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                        posterPath = "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 615678,
                        originalTitle = "Thunder Force",
                        overview = "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city",
                        posterPath = "/279yOM4OQREL36B3SECnRxoB4MZ.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 791373,
                        originalTitle = "Zack Snyder's Justice League",
                        overview = "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                        posterPath = "/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 460465,
                        originalTitle = "Mortal Kombat",
                        overview = "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                        posterPath = "/8yhtzsbBExY8mUct2GOk4LDDuGH.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 412656,
                        originalTitle = "Chaos Walking",
                        overview = "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
                        posterPath = "/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 634528,
                        originalTitle = "The Marksman",
                        overview = "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                        posterPath = "/6vcDalR50RWa309vBH1NLmG2rjQ.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 527774,
                        originalTitle = "Raya and the Last Dragon",
                        overview = "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                        posterPath = "/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 664767,
                        originalTitle = "Mortal Kombat Legends: Scorpion's Revenge",
                        overview = "After the vicious slaughter of his family by stone-cold mercenary Sub-Zero, Hanzo Hasashi is exiled to the torturous Netherrealm. There, in exchange for his servitude to the sinister Quan Chi, he’s given a chance to avenge his family – and is resurrected as Scorpion, a lost soul bent on revenge. Back on Earthrealm, Lord Raiden gathers a team of elite warriors – Shaolin monk Liu Kang, Special Forces officer Sonya Blade and action star Johnny Cage – an unlikely band of heroes with one chance to save humanity. To do this, they must defeat Shang Tsung’s horde of Outworld gladiators and reign over the Mortal Kombat tournament.",
                        posterPath = "/4VlXER3FImHeFuUjBShFamhIp9M.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 458576,
                        originalTitle = "Monster Hunter",
                        overview = "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                        posterPath = "/1UCOF11QCw8kcqvce8LKOO6pimh.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 793723,
                        originalTitle = "Sentinelle",
                        overview = "Transferred home after a traumatizing combat mission, a highly trained French soldier uses her lethal skills to hunt down the man who hurt her sister.",
                        posterPath = "/fFRq98cW9lTo6di2o4lK1qUAWaN.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 644083,
                        originalTitle = "Twist",
                        overview = "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
                        posterPath = "/29dCusd9PwHrbDqzxNG35WcpZpS.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 587807,
                        originalTitle = "Tom & Jerry",
                        overview = "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                        posterPath = "/6KErczPBROQty7QoIsaa6wJYXZi.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 544401,
                        originalTitle = "Cherry",
                        overview = "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
                        posterPath = "/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 587996,
                        originalTitle = "Bajocero",
                        overview = "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                        posterPath = "/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 464052,
                        originalTitle = "Wonder Woman 1984",
                        overview = "A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious ancient force that puts her powers in jeopardy.",
                        posterPath = "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 581389,
                        originalTitle = "승리호",
                        overview = "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake.",
                        posterPath = "/p9YDHJKvUoi7v2SCd3vLGPae1Xp.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 632357,
                        originalTitle = "The Unholy",
                        overview = "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                        posterPath = "/b4gYVcl8pParX8AjkN90iQrWrWO.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 615457,
                        originalTitle = "Nobody",
                        overview = "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                        posterPath = "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 755812,
                        originalTitle = "Miraculous World: New York, United HeroeZ",
                        overview = "During a school field trip, Ladybug and Cat Noir meet the American superheroes, whom they have to save from an akumatised super-villain. They discover that Miraculous exist in the United States too.",
                        posterPath = "/zNxqXCEEBllgbVOCuHLPasNsovt.jpg"
                )
        )
        movies.add(
                MovieResponse(
                        id = 522444,
                        originalTitle = "Black Water: Abyss",
                        overview = "An adventure-loving couple convince their friends to explore a remote, uncharted cave system in the forests of Northern Australia. With a tropical storm approaching, they abseil into the mouth of the cave, but when the caves start to flood, tensions rise as oxygen levels fall and the friends find themselves trapped. Unknown to them, the storm has also brought in a pack of dangerous and hungry crocodiles.",
                        posterPath = "/95S6PinQIvVe4uJAd82a2iGZ0rA.jpg"
                )
        )
        return movies
    }

    fun generateDummyShowsResponse(): List<ShowResponse>{
        val shows = ArrayList<ShowResponse>()

        shows.add(
                ShowResponse(
                        id = 88396,
                        originalName = "The Falcon and the Winter Soldier",
                        overview = "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                        posterPath = "/6kbAMLteGO8yyewYau6bJ683sw7.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 71712,
                        originalName = "The Good Doctor",
                        overview = "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                        posterPath = "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 60735,
                        originalName = "The Flash",
                        overview = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        posterPath = "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 95557,
                        originalName = "Invincible",
                        overview = "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                        posterPath = "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 1416,
                        originalName = "Grey's Anatomy",
                        overview = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        posterPath = "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 69050,
                        originalName = "Riverdale",
                        overview = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        posterPath = "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                )
        )

        shows.add(
                ShowResponse(
                        id = 63174,
                        originalName = "Lucifer",
                        overview = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        posterPath = "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 85271,
                        originalName = "WandaVision",
                        overview = "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        posterPath = "/glKDfE6btIRcVB5zrjspRIs4r52.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 1402,
                        originalName = "The Walking Dead",
                        overview = "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        posterPath = "/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 120168,
                        originalName = "¿Quién mató a Sara?",
                        overview = "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                        posterPath = "/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
                )
        )
        shows.add(
                ShowResponse(
                        id = 95057,
                        originalName = "Superman & Lois",
                        overview = "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                        posterPath = "/6SJppowm7cdQgLkvoTlnTUSbjr9.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 62286,
                        originalName = "Fear the Walking Dead",
                        overview = "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        posterPath = "/4UjiPdFKJGJYdxwRs2Rzg7EmWqr.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 1399,
                        originalName = "Game of Thrones",
                        overview = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                        posterPath = "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 71694,
                        originalName = "Snowfall",
                        overview = "Los Angeles. 1983. A storm is coming and it's name is crack. Set against the infancy of the crack cocaine epidemic and its ultimate radical impact on the culture as we know it, the story follows numerous characters on a violent collision course.",
                        posterPath = "/orvFrLzqSeW5qTFpfJEbPfHRPWg.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 79460,
                        originalName = "Legacies",
                        overview = "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                        posterPath = "/qTZIgXrBKURBK1KrsT7fe3qwtl9.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 77169,
                        originalName = "Cobra Kai",
                        overview = "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                        posterPath = "/obLBdhLxheKg8Li1qO11r2SwmYO.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 91605,
                        originalName = "I Am...",
                        overview = "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                        posterPath = "/oogunE22HDTcTxFakKQbwqfw1qo.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 79008,
                        originalName = "Luis Miguel: La Serie",
                        overview = "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                        posterPath = "/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 44217,
                        originalName = "Vikings",
                        overview = "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                        posterPath = "/bQLrHIRNEkE3PdIWQrZHynQZazu.jpg"
                )
        )

        shows.add(
                ShowResponse(
                        id = 100617,
                        originalName = "Transformers: War for Cybertron: Siege",
                        overview = "On their dying planet, the Autobots and Decepticons battle fiercely for control of the AllSpark in the Transformers universe's origin story.",
                        posterPath = "/14B6I4FxCMiDoPOwzj27EcqqY6i.jpg"
                )
        )
        return shows
    }
}