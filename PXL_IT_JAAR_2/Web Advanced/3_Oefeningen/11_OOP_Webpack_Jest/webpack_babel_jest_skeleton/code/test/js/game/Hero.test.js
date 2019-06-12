import Hero from "../../../src/js/game/Hero";

test('moveLeft to decrease X by 1',
    () => {
        let hero = new Hero(1, 2);
        hero.moveLeft();
        expect(hero.X).toBe(0);
    });

test('moveRight to increase X by 1',
    () => {
        let hero = new Hero(1, 2);
        hero.moveRight();
        expect(hero.X).toBe(2);
    });
