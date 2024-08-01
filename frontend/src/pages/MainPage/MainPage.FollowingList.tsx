import { Link } from "react-router-dom";
import FollowingProfile from "./MainPage.Following.Profile";
import proimg1 from "../../assets/img/minseo.png";
import proimg2 from "../../assets/img/hyukjin.png";
import proimg3 from "../../assets/img/minchae.png";
import proimg4 from "../../assets/img/jiheun.png";
import proimg5 from "../../assets/img/hee.png";
import proimg6 from "../../assets/img/me.png";
import proimg7 from "../../assets/img/bok.png";
import proimg8 from "../../assets/img/princess.png";

const profiles = [
  {
    id: 0,
    profileName: "강민서",
    profileImage: proimg1,
  },
  {
    id: 1,
    profileName: "김혁진",
    profileImage: proimg2,
  },
  {
    id: 2,
    profileName: "김민채",
    profileImage: proimg3,
  },
  {
    id: 3,
    profileName: "서지흔",
    profileImage: proimg4,
  },
  {
    id: 4,
    profileName: "서희",
    profileImage: proimg5,
  },
  {
    id: 5,
    profileName: "조원우",
    profileImage: proimg6,
  },
  {
    id: 6,
    profileName: "개복어",
    profileImage: proimg7,
  },
  {
    id: 7,
    profileName: "석양공주님",
    profileImage: proimg8,
  },
];

function FollowingList() {
  return (
    <div className="flex flex-col bg-white p-10 rounded-3xl w-[1272px] shadow-lg mb-10">
      <div className="flex items-end justify-between w-[1192px] mb-8">
        <span className="text-h3 text-gray-900 font-bold">
          팔로우 중인 크리에이터
        </span>
        <Link to="/creator/list">
          <span className="text-h5 text-gray-700">전체 크리에이터 보기</span>
        </Link>
      </div>
      <div className=" flex flex-wrap justify-start">
        {profiles.map((profile) => (
          <div
            key={profile.id}
            className="flex-grow-0 flex-shrink-0 basis-1/6 p-2"
          >
            <FollowingProfile
              key={profile.id}
              profileName={profile.profileName}
              profileImage={profile.profileImage}
            />
          </div>
        ))}
      </div>
    </div>
  );
}

export default FollowingList;