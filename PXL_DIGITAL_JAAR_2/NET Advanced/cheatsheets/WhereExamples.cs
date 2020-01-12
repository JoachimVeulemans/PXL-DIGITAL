using LinqExamples.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace LinqExamples
{
    public class WhereExamples
    {
        public int[] FilterOutNumbersDivisibleByFive(int[] numbers)
        {
            var filteredNumbers = from number in numbers
                                  where number % 5 == 0
                                  select number;
            return filteredNumbers.ToArray();
            //Tip: use the "ToArray" extension method to convert an IEnumerable to an Array
        }

        public IList<Person> FilterOutPersonsThatAreEighteenOrOlder(List<Person> persons)
        {
            var filteredPersons = from person in persons
                where person.Age == 18
                select person;
            return filteredPersons.ToArray();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }
    }
}