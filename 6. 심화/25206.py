idx = 0
score_list = []
sub_total = 0.0
score_total = 0

while idx < 20:
    idx += 1
    score = input().split()
    if not score[2] == "P":
        sub_total += float(score[1])
        if score[2] == "A+":
            score_total += float(score[1]) * 4.5
        elif score[2] == "A0":
            score_total += float(score[1]) * 4.0
        elif score[2] == "B+":
            score_total += float(score[1]) * 3.5
        elif score[2] == "B0":
            score_total += float(score[1]) * 3.0
        elif score[2] == "C+":
            score_total += float(score[1]) * 2.5
        elif score[2] == "C0":
            score_total += float(score[1]) * 2.0
        elif score[2] == "D+":
            score_total += float(score[1]) * 1.5
        elif score[2] == "D0":
            score_total += float(score[1]) * 1.0

print(score_total / sub_total)