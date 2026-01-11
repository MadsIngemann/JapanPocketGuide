package be.ehb.japanguide.data

import be.ehb.japanguide.R
import be.ehb.japanguide.data.models.Attraction
import be.ehb.japanguide.data.models.City
import be.ehb.japanguide.data.models.Food
import be.ehb.japanguide.data.models.Phrase

object LocalDataSource {

    val attractions = listOf(
        Attraction(
            id = "kappabashi",
            name = "Kappabashi Street (Kitchenware Town)",
            imageResId = R.drawable.kappabashi,
            description = "Set aside an hour or two to browse this famous kitchenware district between Asakusa and Ueno. You will find everything from Japanese knives and ceramics to fun souvenirs like ultra-realistic plastic food models."
        ),
        Attraction(
            id = "shinjuku",
            name = "Shinjuku Golden Gai",
            imageResId = R.drawable.shinjuku,
            description = "This is a compact grid of narrow alleys packed with tiny, themed bars, many with only a handful of seats. It is best after dark, and it is normal that some bars have a cover charge, so check the signs before you step in."
        ),
        Attraction(
            id = "park",
            name = "Kita-no-maru Park",
            imageResId = R.drawable.park,
            description = "Just north of the Imperial Palace area, this park is a quiet place for a stroll, with moats and greenery that feel surprisingly removed from the city. If you visit in sakura season, it is especially beautiful, and the area is known for cherry blossoms in spring."
        ),
        Attraction(
            id = "chikigai",
            name = "Chikagai (underground shopping streets)",
            imageResId = R.drawable.chikigai,
            description = "Tokyo has extensive underground shopping areas connected to major stations, and the Yaesu Chikagai at Tokyo Station is a classic example. It is an easy way to find cafés, restaurants, and shops without worrying about the weather."
        ),
        Attraction(
            id = "monkey",
            name = "Arashiyama Monkey Park Iwatayama",
            imageResId = R.drawable.monkey,
            description = "This is a short uphill walk with a big payoff. At the top you get sweeping views over Kyoto and the chance to see wild Japanese macaques up close. You can feed them in the designated area (through a mesh enclosure), and it’s worth following the posted rules since they are free-roaming animals."
        ),
        Attraction(
            id = "bar",
            name = "Tonkatsu Shimizu",
            imageResId = R.drawable.bar,
            description = "This tiny bar is known for a seriously thick tonkatsu sandwich, and a strong drinks lineup that includes plenty of sake (Japanese rice wine). Guests are allowed to write and draw on the walls, so the whole place feels like a living guestbook. Do not expect much English from the bartender, so having Google Translate ready can make ordering and chatting a lot easier."
        ),
        Attraction(
            id = "jojakkoji",
            name = "Jojakkoji Observatory",
            imageResId = R.drawable.jojakkoji,
            description = "Up in the Sagano area, Jojakko-ji is a hillside temple with a calm atmosphere and beautiful seasonal scenery. If you walk up through the grounds, you reach an observatory with a clear view over Sagano and the city of Kyoto, which feels less crowded than the Arashiyama Station area."
        ),
        Attraction(
            id = "higashiyama",
            name = "Higashiyama District",
            imageResId = R.drawable.higashiyama,
            description = "This is the old Kyoto many people picture, with traditional streets lined with small shops, cafés, and restaurants that have served visitors for centuries. Wander the sloping lanes around Sannenzaka and Ninenzaka on the way toward Kiyomizu-dera, and treat it as a slow stroll with plenty of photo stops."
        ),
        Attraction(
            id = "river",
            name = "Dōtonbori (canal area)",
            imageResId = R.drawable.river,
            description = "Dōtonbori is Osaka at full volume, with bright billboards, street food, and that iconic photo spot by the canal near the Glico Running Man sign. Go in the evening when everything lights up, and wander with an empty schedule and an appetite."
        ),
        Attraction(
            id = "castle",
            name = "Osaka Castle",
            imageResId = R.drawable.castle,
            description = "Osaka Castle is one of the city’s signature landmarks, and it makes for an easy, well-rounded visit. Explore the castle tower’s museum, then take a walk around the park grounds, which is great for photos."
        ),
        Attraction(
            id = "aquarium",
            name = "Osaka Aquarium",
            imageResId = R.drawable.aquarium,
            description = "The Osaka Aquarium is one of Osaka’s most popular indoor attractions and a reliable choice on rainy days. The visit is designed around a huge Pacific Ocean tank where you gradually make your way through multiple marine environments as you spiral around the central exhibits."
        ),
        Attraction(
            id = "nara",
            name = "Nara Park",
            imageResId = R.drawable.nara,
            description = "From Osaka, Nara is close enough for a simple half-day or full-day trip by train. In Nara Park, you will meet the famous free-roaming deer, and you can buy shika senbei crackers to feed them. The deer are very polite and may bow as they hope to receive a cracker."
        ),
        Attraction(
            id = "highland",
            name = "Fuji-Q Highland",
            imageResId = R.drawable.highland,
            description = "Fuji-Q Highland is the go-to stop if you want high-adrenaline rides with Mount Fuji in the background. It is famous for its major roller coasters, and it works well as a half-day or full-day experience. If you are not into roller coasters, you can access the park for free and enjoy the theme park atmosphere and the scenic Mount Fuji view."
        ),
        Attraction(
            id = "lake",
            name = "Lake Kawaguchiko",
            imageResId = R.drawable.lake,
            description = "Lake Kawaguchiko is one of the easiest places to get a Mount Fuji postcard moment. On clear days, the lake’s northern side is especially known for strong Mount Fuji views, and you can get great photo angles simply by walking the shoreline and stopping at viewpoints as you go."
        ),
        Attraction(
            id = "bike",
            name = "Rent a bike",
            imageResId = R.drawable.bike,
            description = "I strongly recommend renting a bike in Fujikawaguchiko, because it is one of the most convenient ways to explore at your own pace. A ride around Lake Kawaguchiko lets you chase the best Mount Fuji views from multiple angles, and it turns the whole area into a relaxed, scenic loop instead of a series of separate bus stops."
        ),
        Attraction(
            id = "onsen",
            name = "Fujiyama Onsen",
            imageResId = R.drawable.onsen,
            description = "Fujiyama Onsen is a classic way to finish the day, especially after Fuji-Q or a long walk around the lake. An onsen is a Japanese hot spring bath, usually separated by gender. Here, you can soak in mineral-rich baths and fully relax."
        )
    )

    val cities = listOf(
        City(
            id = "tokyo",
            name = "Tokyo",
            tagline = "Explore the energetic capital of Japan.",
            imageResId = R.drawable.tokyo,
            intro = "Tokyo is Japan’s capital, and it’s a city of sharp contrasts where traditional neighborhoods and tiny backstreet spots sit right next to neon, skyscrapers, and huge train stations. It can feel intense in the best way, so it helps to explore area by area and build in small breaks like parks, cafés, or a quiet stroll in between.",
            topAttractionIds = listOf("kappabashi", "shinjuku", "park", "chikigai")
        ),
        City(
            id = "kyoto",
            name = "Kyoto",
            tagline = "Wander through timeless streets and classic Japanese culture.",
            imageResId = R.drawable.kyoto,
            intro = "Kyoto is Japan’s former imperial capital, and it’s the place to experience the country’s most classic atmosphere. Expect temples, wooden streets, and scenic hillside areas where the pace is slower. It is best enjoyed in the early morning or around sunset when the crowds thin out.",
            topAttractionIds = listOf("monkey", "bar", "jojakkoji", "higashiyama")
        ),
        City(
            id = "osaka",
            name = "Osaka",
            tagline = "Experience a lively city famous for food and nightlife.",
            imageResId = R.drawable.osaka,
            intro = "Osaka is Japan’s kitchen, and it’s a lively city built for eating well and having a good night out. Mix the big landmarks with street food, arcade energy, and neighborhoods that stay busy after dark, and use Osaka as a convenient base for easy day trips nearby.",
            topAttractionIds = listOf("river", "castle", "aquarium", "nara")
        ),
        City(
            id = "fujikawaguchiko",
            name = "Fujikawaguchiko",
            tagline = "Discover a quiet escape with scenic walks and Mount Fuji as the backdrop.",
            imageResId = R.drawable.fujikawaguchiko,
            intro = "Fujikawaguchiko is a small town at the foot of Mount Fuji, and it’s one of the best places to enjoy the landmark without rushing. The rhythm is simple: check the weather, chase views around Lake Kawaguchiko (ideally by bike), and finish the day with a relaxing onsen.",
            topAttractionIds = listOf("highland", "lake", "bike", "onsen")
        )
    )

    val foods = listOf(
        Food(
            id = "okonomiyaki",
            name = "Okonomiyaki",
            imageResId = R.drawable.okonomiyaki,
            description = "A savoury Japanese “pancake” made with cabbage and batter, cooked on a hot plate and topped with sauce, mayo, and bonito flakes."
        ),
        Food(
            id = "tonkatsu",
            name = "Tonkatsu",
            imageResId = R.drawable.tonkatsu,
            description = "A crispy, deep-fried breaded pork cutlet. It’s served on its own or as part of the famous sandwich, “Tonkatsu Sando.”"
        ),
        Food(
            id = "onigiri",
            name = "Onigiri",
            imageResId = R.drawable.onigiri,
            description = "A handheld rice ball, often triangle-shaped, with fillings like salmon, tuna mayo, or pickled plum. Usually wrapped in seaweed and perfect on the go."
        ),
        Food(
            id = "yakitori",
            name = "Yakitori",
            imageResId = R.drawable.yakitori,
            description = "Skewered meat or vegetables grilled over charcoal, seasoned with a soy glaze. Great for sharing at izakayas (Japanese pubs)."
        ),
        Food(
            id = "curry",
            name = "Karē",
            imageResId = R.drawable.curry,
            description = "A mild, thick curry sauce usually served over rice. Often includes vegetables, chicken, or beef, and can also be served on top of tonkatsu."
        ),
        Food(
            id = "konbini",
            name = "Konbini",
            imageResId = R.drawable.konbini,
            description = "You can eat surprisingly well at Japanese convenience stores (konbini). They’re packed with tasty, affordable meals and snacks, from onigiri and bento boxes to fresh desserts and hot drinks."
        )
    )

    val phrases = listOf(
        Phrase(
            english = "Hello",
            romaji = "Konnichiwa",
            japanese = "こんにちは",
            explanation = "Say Konnichiwa when you greet someone during the day - walking into a shop, arriving at a restaurant, or starting a conversation politely."
        ),
        Phrase(
            english = "Thank you",
            romaji = "Arigatou gozaimasu",
            japanese = "ありがとうございます",
            explanation = "This is the safe, polite “thank you.” You’ll use it all the time - after receiving help, paying in a store, or when a waiter brings you food."
        ),
        Phrase(
            english = "Please",
            romaji = "Kudasai",
            japanese = "ください",
            explanation = "Use Kudasai when you’re asking for something in a friendly and respectful way, like “one more, please” or “this one, please.”"
        ),
        Phrase(
            english = "Excuse me",
            romaji = "Sumimasen",
            japanese = "すみません",
            explanation = "Use Sumimasen to get someone’s attention, to say “excuse me” when passing by, or as a light “sorry/thank you” when someone helps you."
        ),
        Phrase(
            english = "Yes",
            romaji = "Hai",
            japanese = "はい",
            explanation = "Hai means “yes,” but it can also mean “I understand” or “okay,” depending on the context."
        ),
        Phrase(
            english = "I humbly receive",
            romaji = "Itadakimasu",
            japanese = "いただきます",
            explanation = "Say Itadakimasu right before you start eating. It’s a small moment of gratitude toward the food and everyone who made the meal possible."
        ),
        Phrase(
            english = "Welcome (in shops)",
            romaji = "Irasshaimase!",
            japanese = "いらっしゃいませ",
            explanation = "You’ll hear this a lot in shops and restaurants as staff welcome you. You don’t need to reply; a small nod or smile is perfectly polite."
        )
    )

    fun cityById(id: String): City? = cities.find { it.id == id }
    fun attractionById(id: String): Attraction? = attractions.find { it.id == id }
}
