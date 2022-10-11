# Envelo_akademia


1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?

	Interfejsy mogą zwierać tylko stałe i deklaracje metod ale bez definiowania zachowania. Implementując interfejs musimy zaimplementować również jego metody. Metody w interfejsie mówią co ma robić dana klasa ale nie jak ma to robić. 

	Klasa abstrakcyjna jak sama nazwa wskazuje jest pewnym abstraktem, z którego nie utworzymy obiektu. Inna klasa może dziedziczyć po klasie abstrakcyjnej, ale tylko raz. Tj klasa nadrzędna może dziedziczyć tylko po jednej klasie abstrakcyjnej. Mogą posiadać swoje metody zarówno abstrakcyjne (bez ciała) jak i z implementacją. Klasa abstrakcyjna może być pomocna do określenia ogólnego typu bazowego, do którego nie chcemy umożliwić tworzenia obiektów. 
	
	np. tworzymy klasę abstrakcyjną budynek i określamy w niej jakieś metody. 
	Następnie tworzymy klasę dworzec kolejowy, która dziedziczy po budynku. Możemy też utworzyć dworzec autobusowy również dziedziczący po budynku. Dzięki takiemu zabiegowi będziemy mogli utworzyć np listę budynków, w której znajdą się zarówno dworce kolejowe jak i autobusowe. 
	
	Idąc dalej tym tropem, moglibyśmy utworzyć interfejs przyjazd_odjazd. Jeśli nasz dworzec kolejowy zaimplementował by taki interfejs to należałoby ustawić w nim ciało metody i np określić, że odjazdy i przyjazdy odbywają się z peronów (gdzie w dworcach autbusowych odbywają się z przystanków). 

	

1.B. Czym różni się tablica od listy liniowej?

	w tablicy z góry definiujemy rozmiar, natomiast w liście liniowej rozmiar możemy swobodnie zwiększać lub zmniejszać stosując odpowiednie metody. Lista liniowa charakteryzuje się tym, że każdy element ma informacje o poprzedniku i następniku. Dzięki temu usuwanie i dodawanie nowych elementów jest szybkie.  
