using System;
using System.Collections.Generic;
using System.Linq;
using LinqExamples.Models;

namespace LinqExamples
{
    public class JoinExamples
    {
        public int[] GetIntersection(int[] firstList, int[] secondList)
        {
            var intersectionList = from first in firstList
                join second in secondList on first equals second
                select first;
            return intersectionList.ToArray();
            //Tip: use the "ToArray" extension method to convert an IEnumerable to an Array
        }

        public IList<string> FindCouplesByAgeUsingJoin(List<Person> boys, List<Person> girls)
        {
            var couplesList = from boy in boys
                join girl in girls on boy.Age equals girl.Age
                select boy.Name + " and " + girl.Name;
            return couplesList.ToList();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }
    }
}