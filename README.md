# Task 1
First learning task from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Task description (Czech language only)
### Co je potřeba znát

Pro vyřešení této úlohy je třeba

-   Rozumět pojmům třída, instance, metoda, volání metody, parametry
    metody, návratová hodnota metody, atribut, typ (parametru, návratové
    hodnoty nebo atributu), konstruktor, základní if a for, znát význam
    metody `System.out.println()` a umět číst JavaDoc dokumentaci.
    
### Popis úlohy    

Úloha simuluje přidělování paměti úlohám na počítači.

K dispozici máte třídu `Task` reprezentující výpočetně náročnou úlohu.
Detaily viz JavaDoc komentáře.

Žádnou z předdefinovaných tříd neměňte! Používejte výstižné anglické
názvy identifikátorů (názvy tříd, atributů, metod, proměnných, ...)!
Vyvarujte se zbytečnému použití stejného kódu na více místech!
Nepoužívejte diakritiku!

### Zadání pro cvičení (3 body)
-   Vytvořte třídu `Memory`, která bude představovat operační paměť.
    Paměť si bude pamatovat svou velikost (kapacita paměti v MB) a
    aktuální množství alokované paměti. Do třídy `Memory` přidejte
    následující metody:
    -   `Memory(int capacity)`: Konstruktor, který vytvoří prázdnou
        operační paměť požadované velikosti. Jako vstupní parametr vezme
        kapacitu paměti v MB.
    -   `int getAllocatedVolume()`: Metoda vrátí velikost obsazené
        paměti v MB.
    -   `int getFreeVolume()`: Metoda vrátí velikost volné paměti v MB.
    -   `boolean allocate(Task task)`: Metoda alokuje paměť, která je
        vyžadována úlohou předanou v parametru `task`. Metoda neumožní
        přidělit paměť úloze, která pro svůj výpočet požaduje více
        paměti, než je aktuálně k dispozici. Pokud dojde k úspěšnému
        přidělení paměti, metoda vrátí `true`, jinak vrátí `false`.
    -   `String toString()`: Metoda vrátí textový řetězec popisující
        stav operační paměti ve tvaru:

            Memory: allocated <ALLOCATED> from <CAPACITY> MB

-   Vytvořte třídu `Main` s metodou `main` spustitelnou z příkazového
    řádku. S následujícím obsahem:
    -   Vytvoří se paměť o velikosti 1000 MB a druhá paměť o velikosti
        800 MB.
    -   Vytvoří se 3 úlohy, které vyžadují 500, 600 a 700 MB.
    -   První úloze (500 MB) přidělte místo z první paměti.
    -   Druhé úloze (600 MB) přidělte místo z první paměti.
    -   První úloze (500 MB) přidělte místo z druhé paměti.
    -   Třetí úloze (700 MB) přidělte místo z druhé paměti.
    -   Na std. výstup se vypíše stav obou pamětí a všech úkolů (viz
        metoda `toString()`. Při správném řešení by se měl na výstupu
        objevit následující text:

            Memory: allocated 500 from 1000 MB
            Memory: allocated 500 from 800 MB
            Task: 500 MB - inactive
            Task: 600 MB - inactive
            Task: 700 MB - inactive

### Zadání na doma (3 body)
-   Ve třídě `Memory` udělejte následující změny:
    -   Upravte metodu `boolean allocate(Task task)`: Metoda neumožní
        přidělit paměť úloze, která je již aktivní (již běží v nějaké
        paměti) a která vyžaduje pro svůj výpočet více paměti, než je
        aktuálně k dispozici. Pokud dojde k úspěšnému přidělení paměti,
        metoda aktivuje úlohu a vrátí `true`, jinak metoda vrátí
        `false`.
    -   Přidejte metodu `boolean release(Task task)`: Metoda simuluje
        uvolnění paměti, která byla přidělena úloze. Úloha je předána v
        parametru `Task`. Metoda neumožní uvolnit paměť úloze, která
        není aktivní a která vyžaduje pro svůj výpočet více paměti, než
        je aktuálně přiděleno. Pokud dojde k úspěšnému uvolnění paměti,
        metoda deaktivuje úlohu a vrátí `true`, jinak metoda vrátí
        `false`.

-   Vytvořte třídu `Planner` reprezentující plánovač. Do této třídy
    přidejte následující metodu:
    -   `boolean move(Memory source, Memory destination, Task task)`:
        Metoda simuluje přesunutí úlohy (`task`) z jedné paměti
        (`source`) do druhé (`destination`). Metoda neumožní přesun v
        případě, že:
        -   úloha není aktivní;
        -   úloha pro svůj výpočet vyžaduje více paměti, než je
            přiděleno v první paměti;
        -   úloha pro svůj výpočet vyžaduje více paměti, než je k
            dispozici v druhé paměti.

        V případě úspěšného přesunu metoda vrátí `true`, jinak `false`.
-   Zdokumentujte všechny vámi vytvořené třídy a jejich metody pomocí
    JavaDoc.

### Poznámky pro cvičící
-   Zadání se studenty projděte a vysvětlete. Zejména vysvětlete účel a
    metody třídy `Task`. (Pozor: to, jestli je proces aktivní, se v
    první části nebere v potaz. Využívá se teprve v druhé části.).
-   Vysvětlete (poraďte) studentům s konstruktory. To platí zejména pro
    cvičení, která jsou před přednáškou (na přednášce se vytváření
    konstruktorů ještě nebralo).
-   Vysvětlete/ukažte/poraďte s `if`. Na přednášce bylo ukázáno jen
    velmi stručně.

## License
MIT