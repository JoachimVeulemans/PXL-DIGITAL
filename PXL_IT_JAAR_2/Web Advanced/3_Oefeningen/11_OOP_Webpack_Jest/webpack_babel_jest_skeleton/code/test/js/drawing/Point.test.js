import Point from '../../../src/js/drawing/Point';
describe('constructor',
    () => {
        it('should generate a Point-object for valid args',
            () => {
                let point = new Point(1, 1);
                expect(point).toBeInstanceOf(Point)
            }
        )
        it('should throw error when 1st parameter is not a number',
            () => {
                expect(() => {
                    new Point("a", 1);
                }).toThrow(Error)
            })
        it('should throw error when 2nd parameter is not a number',
            () => {
                expect(() => {
                    new Point(1, "a");
                }).toThrow(Error)
            })
    }
);

test('getX to return the correct value',
    () => {
        let point = new Point(1, 2);
        let x = point.getX();
        expect(x).toBe(1);
    });

test('toString to return the correct value', () => {
    let point=new Point(1,2);
    let returnedString = point.toString();
    expect(returnedString).toBe("(1,2)");
});

