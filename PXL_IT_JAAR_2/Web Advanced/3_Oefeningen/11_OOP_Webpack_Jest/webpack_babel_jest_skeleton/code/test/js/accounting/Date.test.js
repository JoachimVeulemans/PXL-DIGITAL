import Date from "../../../src/js/accounting/Date";

test('toString to return the correct value',
    () => {
        let date = new Date(1, 2, 2010);
        let output = date.toString();
        expect(output).toBe("1/2/2010");
    });

test('toStringMonth to return the correct value',
    () => {
        let date = new Date(1, 2, 2010);
        let output = date.toStringMonth();
        expect(output).toBe("1/feb/2010");
    });
