using System;
using System.Collections.Generic;
using System.Linq;
using LinqExamples.Models;

namespace LinqExamples
{
    public class GroupExamples
    {
        public IList<IGrouping<int, int>> GroupEvenAndOddNumbers(int[] numbers)
        {
            var groupedNumbers = from number in numbers
                group number by number % 2;
            return groupedNumbers.ToList();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }

        public IList<PersonAgeGroup> GroupPersonsByAge(List<Person> persons)
        {
            var groupedPersons = from person in persons
                group person by person.Age
                into personsgroup
                select new PersonAgeGroup
                {
                    Age = personsgroup.Key,
                    Persons = personsgroup
                };
            return groupedPersons.ToList();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }
    }
}